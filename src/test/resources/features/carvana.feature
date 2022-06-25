Feature: Carvana Functionalities
Scenario : Validate CAR FINDER menu item

Given user is on "https://www.carvana.com/"
When user clicks on "CAR FINDER" menu item
Then user should be navigated to "https://www.carvana.com/help-me-search/"
And user should see "WHAT CAR SHOULD I GET?" text
And user should see "Car Finder can help! Answer a few quick questions to find the right car for you." text
And user should see "TRY CAR FINDER" link
When user clicks on "TRY CAR FINDER" link
Then user should be navigated to "https://www.carvana.com/help-me-search/qa"
And user should see "WHAT IS MOST IMPORTANT TO YOU IN YOUR NEXT CAR?" text
And user should see "Select up to 4 in order of importance" text
