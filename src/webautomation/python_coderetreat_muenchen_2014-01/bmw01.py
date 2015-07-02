# import unittest
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
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

import unittest

class BMWTestCase(unittest.TestCase):

    def setUp(self):
        self.browser = webdriver.Chrome()
        self.addCleanup(self.browser.quit)
        self.browser.get('http://www.klosebrothers.de/parkcalc')
        self.submitError = u'FEHLER! Bitte ein korrekt formatiertes Datum eingeben'.upper()

    def tearDown(self):
        pass

    def testPageTitle(self):
        driver = self.browser

        self.assertIn('Parking Cost Calculator', driver.title)

    def testSubmitErrorMessageTagExists(self):
        driver = self.browser
        driver.find_element_by_name('Submit').click()
        try:
            driver.find_element_by_tag_name('b')
            self.assertTrue(True)
        except NoSuchElementException:
            self.assertTrue(False)

    def testPriceForSevenDays(self):
        driver = self.browser
        driver.find_element_by_name('StartDatum')
        driver.send_keys('01/01/2014')

    def testSubmitErrorMessage(self):
        driver = self.browser
        driver.find_element_by_name('Submit').click()
        self.assertEqual(self.submitError, driver.find_element_by_tag_name('b').text)

if __name__ == '__main__':
    unittest.main(verbosity=2)
