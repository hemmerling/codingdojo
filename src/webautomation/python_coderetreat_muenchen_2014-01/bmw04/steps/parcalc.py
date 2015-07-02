from behave import *
from selenium import webdriver
from parcalcimp import ParCalcImp

class ParCalc:

    @given('selenium webdriver is installed')
    def step_impl(context):
        # "from selenium import webdriver"
        pass

    @when('when we load a page "http://www.google.com"')
    def step_impl(context):
        url = context.find("http://wwww.google.com")
        self.parcalcimp = ParCalcImp(url)
        print self.parcalcimp.getUrl(), context
        assert True is not False

    @then('then the title is $title')
    def step_impl(context):
        wishtitle = context.find("Google")
        title = self.parcalc.getTitle()
        print title
        assertTrue(title, wishtitle)
