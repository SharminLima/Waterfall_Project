Feature: This is contact page



@lima
Scenario: verify user can contact by sending message
Given Open Demoblaze <"URL">
Then click contacctt
Then enter contact email
Then enter contact name
Then enter message
Then click send message
And Verify user can contact by sending message


