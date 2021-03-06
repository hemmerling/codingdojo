#!/usr/bin/env python
##
#
#  @package pyselenium
#  @file    pyyelenium01_test.py
#  @author  Rolf Hemmerling
#  @date    2014-01-06
#
#  This file was originally generated by PyScripter's unitest wizard
#

import unittest
from time import sleep
#from pyselenium01 import PySelenium01
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.common.exceptions import NoSuchElementException


def dummy():
    """ Dummy function for comparison of the return values """
    return

class PySelenium01Test(unittest.TestCase):

    def setUp(self):
        self.browser = webdriver.Firefox()
        self.addCleanup(self.browser.quit)
        self.base_url = "http://localhost:8502/content/doku.php"

        return

    def tearDown(self):
        pass

    def testMain(self):
        business= "Business"
        businessPagename= "business.html"
        enPrefix = "?id=en:"
        self.browser.get(self.base_url)
        self.assertIn('hemmerling', self.browser.title)
        #login_form = self.browser.find_element_by_id('loginForm')
        #username = self.browser.find_element_by_name('username')
        #password = self.browser.find_element_by_name('password')
        #continue_link = self.browser.find_element_by_link_text('Continue')
        #continue_link = self.browser.find_element_by_partial_link_text('Conti')
        try:
            business_link1 = self.browser.find_element_by_link_text(
                            business)
        except NoSuchElementException:
            print "Link-Text 'Business' nicht gefunden"

        try:
            business_link2 = self.browser.find_element(By.CSS_SELECTOR("a[href*='en:business.html']"))
            #.get_attribute('href')
            print "blink2=", business_link2
        except NoSuchElementException:
            print "Tag href nicht gefunden"
        #print business_link
        newUrl = self.base_url+ enPrefix+businessPagename
        print newUrl
        #self.browser.get(newUrl)
        sleep(5)
        return

# run all tests
if __name__ == "__main__":
    try:
        unittest.main()
    except SystemExit as inst:
        if inst.args[0] is True: # raised by sys.exit(True) when tests failed
            raise

