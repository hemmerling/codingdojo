import unittest
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
from time import sleep
from selenium.common.exceptions import NoSuchElementException

# browser = webdriver.Chrome()
#
# browser.get('http://www.klosebrothers.de/parkcalc')
# assert 'Parking Cost' in browser.title
#
# # elem = browser.find_element_by_name('p')  # Find the search box
# # elem.send_keys('seleniumhq' + Keys.RETURN)
#
# browser.quit()

class BMWTestCase(unittest.TestCase):

    def setUp(self):
        self.browser = webdriver.Firefox()
        self.addCleanup(self.browser.quit)
        self.browser.get('http://www.klosebrothers.de/parkcalc')
        self.submitError = u'FEHLER! Bitte ein korrekt formatiertes Datum eingeben'.upper()
        self.startDatum = '01/01/2014'
        self.abfahrDatum = '01/08/2014'
        self.startDatumString = 'StartDatum'
        self.abfahrDatumString = 'AbfahrDatum'
        self.clearFields()
        return

    def clearFields (self):
        self.browser.find_element_by_name(self.startDatumString).clear()
        self.browser.find_element_by_name(self.abfahrDatumString).clear()

    def tearDown(self):
        pass

    def t_estPageTitle(self):
        driver = self.browser

        self.assertIn('Parking Cost Calculator', driver.title)

    def t_estSubmitErrorMessageTagExists(self):
        driver = self.browser
        driver.find_element_by_name('Submit').click()
        try:
            driver.find_element_by_tag_name('b')
            self.assertTrue(True)
        except NoSuchElementException:
            self.assertTrue(False)

    def t_estSubmitErrorMessage(self):
        driver = self.browser
        driver.find_element_by_name('Submit').click()
        self.assertEqual(self.submitError, driver.find_element_by_tag_name('b').text)

    def setStartEndDates(self, driver, beginDate, endDate):
        driver.find_element_by_name(self.startDatumString).send_keys(beginDate)
        driver.find_element_by_name(self.abfahrDatumString).send_keys(endDate)

    def t_estPriceForSevenDays(self):
        driver = self.browser
        self.setStartEndDates(driver, self.startDatum, self.abfahrDatum)
        driver.find_element_by_name('Submit').click()

    def getPrice(self, driver):
        result = driver.find_element(By.CSS_SELECTOR , "b").text
        print "r=", result
        return result

    def testChangeParkingPlace(self):
        driver = self.browser
        self.setStartEndDates(driver, self.startDatum, self.abfahrDatum)
        driver.find_element_by_name('Submit').click()
        defaultPrice = self.getPrice(driver)
        sleep(3)
        el = driver.find_element_by_id('ParkPlatz')
        for option in el.find_elements_by_tag_name('option'):
            if option.text == 'Economy Parking':
                option.click() # select() in earlier versions of webdriver
        driver.find_element_by_name('Submit').click()
        economyPrice = self.getPrice(driver)
        print defaultPrice, economyPrice
        self.assertTrue(economyPrice < defaultPrice)
        sleep(3)
if __name__ == '__main__':
    unittest.main(verbosity=2)
