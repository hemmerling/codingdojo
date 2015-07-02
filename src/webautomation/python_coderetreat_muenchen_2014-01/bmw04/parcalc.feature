Feature: showing off behave

  Scenario: load the website google
     Given selenium webdriver is installed
      when we load a page "http://www.google.com"
      then the title is "Google"
