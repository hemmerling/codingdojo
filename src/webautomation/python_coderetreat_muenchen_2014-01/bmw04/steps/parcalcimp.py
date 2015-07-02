

from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
from selenium.common.exceptions import NoSuchElementException
from time import sleep


# browser = webdriver.Chrome()
#
# browser.get('http://www.klosebrothers.de/parkcalc')
# assert 'Parking Cost' in browser.title
#
# # elem = browser.find_element_by_name('p')  # Find the search box
# # elem.send_keys('seleniumhq' + Keys.RETURN)
#
# browser.quit()

class ParCalcImp:

    def __init__(self, url):
        self.url = url
        self.browser = webdriver.Firefox()
        self.browser.get(url)
        pass

    def getUrl(self):
        return self.url

    def getTitle(self):
        return self.browser.title

aGoogle = ParCalcImp("http://www.google.com")
print aGoogle.getTitle


