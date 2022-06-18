# PlanIt-P2-backend

## Overview:
Plan-It (make itinerary)
The user will be able to pick a category either indoor or outdoor and our application will suggest an itinerary for our user. 

## What Our Users Will Be Able
- Big pic what we want it to be:
- User can sign in to save/get trips
- User enters dest and site plans their trip
- Asks user what they like to do to plan recs
- Asks user for price range, amenities, floor level, etc to get best hotel
- Gives recs for activities, food, entertainment EXT API
- Gives hotel in area EXT API
- Maybe use google api to route things EXT API

## What we need for MVP:
- login/signup
- Category for activities
- Save itinerary if user likes it
- Get old itineraries
- Delete saved itineraries
- Hotel recommendation
- Day activity rec/ Food rec/ night Entertainment rec
- Refresh itinerary if not like (PUT)

## What we will want (icebox):
- Google routes
- Questionnaire to target user results(narrows down suggested activities)
- Share your trip with friends
- Multiplayer trip mode
- Cost of trips

## Basic schemas needed:
- USER (id, usrnm, pswd, fname)
- SAVEDTRIPS(id, tripName, hotel(same per day), day activity(1-n), food(1-n), night act(1-n), user_id)

- External APIs (potential): 
https://rapidapi.com/sharemap-sharemap-default/api/travel-places/details
https://rapidapi.com/tipsters/api/booking-com/ 
## Flow Chart
![PlanIt drawio](https://user-images.githubusercontent.com/101686660/174396700-ec52db06-55d3-4fab-ac55-f1cffa85ae2f.png)



### Wireframe




![image](https://user-images.githubusercontent.com/105670057/174421907-d99ae1b5-eaad-40f5-8bf6-586f4d68ff9f.png)
![image](https://user-images.githubusercontent.com/105670057/174421919-2a7559c2-c8c3-4c05-a023-f5b77396ef79.png)
![image](https://user-images.githubusercontent.com/105670057/174421926-d8094ba8-ae27-4838-bdf9-7385ab9091e7.png)
![image](https://user-images.githubusercontent.com/105670057/174421934-27702112-3995-42a8-88bc-6e96f1521597.png)
