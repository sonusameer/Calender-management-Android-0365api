# Calender-management-Android-0365api

## o365api-android-get-events-app ##

**o365api-android-get-events-app** is my first ever Android app ever! I had fun developing it over the course of the past few weeks and I am pretty sure there are many things to improve on. 

The app itself followed my inspiration to not only learn to develop on Android and Office 365 - the latter part was pretty easy, being a Program Manager at Microsoft for Office 365 App Ecosystem - but to also have a simple companion app without bells and whizzes for my Android phone that I can use in my daily work running across Microsoft Campus in Redmond, hasting from meeting to meeting. All the existing full-blown calendar apps simply didn't cut it for me. I wanted to have a simple easy list of upcoming events with as little detail that help me through my day. I didn't need to edit any event - hard to do while running to your next gig - nor did I want to schedule anything - for this we use Outlook here which I love.

The outcome is now this app on github. And yes, I really use it myself every day. Any crash I found, I fixed it. Any thing that disturbed me, I corrected it to make it my tool :-)

If you try it, I bet with a few adjustments it might become a very handy tool for you, too.

Enough words. Below a more detailed description what this app does.

###Brief 

The application lists upcoming events in an Office 365 Calendar. The list is separated by day and will contain a maximum of 100 events. By long-pressing one event the Organizer can be informed via Office 365 Mail that you are either late or can't make it. The app never changes any calendar event. The app supports notifications to show the next event on the Android lock-screen. This can be changed in preferences, like other settings to change the range of days you want to get events from the Office 365 Calender, and the color tone of the events and if you want to see all events of the current day, even if those happened earlier that day.

Under the hood it uses the Active Directory Authorization Library (ADAL) to logon to Office 365 and doing the OAuth2 dances to get AccessTokens for the Office 365 Calendar, Contacts and Mail APIs.

ADAL for Android is available here: [ADAL](https://github.com/AzureAD/azure-activedirectory-library-for-android)

For my dear Microsoft colleagues in Exchange: the app supports also signing on to our Service Dogfood environment. You can switch this in the preferences. Otherwise it works against the regular public instance of Office 365.

### Feature list

1. Authenticates to Office 365 using your work or school account - MSA or Microsoft Accounts will not work
2. Supports authentication against Office 365 mailboxes in pre-production environment (aka SDF, must be turned on in preference settings)
3. Retrieves and displays in a day-by-day separated list events from the primary calendar of the signed-on Office 365 user
4. The range of days to retrieve events from can be customized via preference settings, but will never exceed 100 events (today, next 7 days, next 30 days)
5. The events are color coded, lighter color are events in the morning, darker colors events in the afternoon. Canceled events are Grey and all day events a different color altogether. The color tone can be changed to a either warmer or cooler color palette in the preference settings. 
6. The event that is on right now is marked with an arrow "==>".
7. Briefly tapping the screen refreshes the display to move the event marker.
8. Sliding down the screen refresh the list with updates from the Office 365 Calendar.
9. Holding an event pops up a context menu to allow sending an e-mail to the Organizer to inform in cases you are running late or can not make the event. 
10. Notifications of upcoming event is displayed in Notification bar and on the lock-screen. This can be turned-off via preference settings.
