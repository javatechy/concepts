# Design A Twitter

Things To Remember:
+ Handle ambiguity : Understand the breadth of the problem and Ask Does the interviewer need  : design/class diagram/ solution
+ Systematic Approch : How you approch the problem and Don't rush into the solution immediately


+ Clarify/ Core Features:  
	+  Sending a tweet
	+  User timeline  - Where you see all your tweets and retweets by you. 
	+  Home Timeline :  you see tweets of people you follow in chronological order
	+  Following : You follow someelse and you able to see his/her tweets on your home timeline
	

Design:

```
abstract Vehicle {
	String licensePlate;
	enum color;
}

class Car extends Vehicle // M
class Bike extends Vehicle //S
class Bus extends Vehicle // L
class Truck extends Vehicle // XL

```

Main Class

```
class ParkingLot(int zipCode){
    placeVehicle(vehicle :Vehicle)
    removeVehicle(vehicle :Vehicle)
}
```

Spot Class to search a Vehicle

```
class Spot(Long id, size: ENUM)
	removeVehicle()
```
	 
### Coding Part:

Use 4 stacks for Each kind of Vehicle. O(1)
Use HashMap for KIND -> VECHICLE STACK MAppning

### Testing:
Check all requirements


### REference:
https://www.youtube.com/watch?v=DSGsa0pu8-k
https://stackoverflow.com/questions/764933/amazon-interview-question-design-an-oo-parking-lot


	 
 
