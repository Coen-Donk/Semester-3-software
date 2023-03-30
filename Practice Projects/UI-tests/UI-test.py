import unittest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

class TestButton(unittest.TestCase):
    def test_button_press(self):
        driver = webdriver.Chrome()

# Navigate to the Google homepage
        driver.get("https://www.google.com/")

# Find the search input element and enter a search query
        search_input = driver.find_element_by_name("q")
        search_input.send_keys("cats")
        search_input.send_keys(Keys.RETURN)

# Verify that the search results page was loaded successfully
        assert "cats - Google Search" in driver.title

# Close the WebDriver instance
        driver.quit()

if __name__ == "__main__":
    unittest.main()