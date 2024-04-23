# Just Eat Coding Challenge
## Overview
This application is a command-line interface (CLI) program designed to fetch and display restaurant data based on a given postcode. It utilizes the Just Eat API to retrieve restaurant information, including name, cuisines, rating, and address.

## Features
Fetch restaurant data based on postcode input.
Display the first 10 restaurants in the given postcode.
Show restaurant name, cuisines, rating (as a number), and address.

## Prerequisites
- JDK 8 or higher
- Maven

## Installation and Setup
#### Clone the repository to your local machine:
```
git clone https://github.com/hannah-cs/JustEatCodingChallenge.git HannahCSCodingChallenge
```

#### Navigate to the project directory (change path if necessary):
```
cd HannahCSCodingChallenge
```
#### Build the application using Maven:
```
mvn clean install
```

## Usage
#### Run the application:
```
java -jar target/JustEatCodingChallenge-0.0.1-SNAPSHOT.jar
```

Follow the prompts to enter a postcode ([list of UK postcodes here](https://github.com/radiac/UK-Postcodes/blob/master/postcodes.csv)) or type 'exit' to quit.
View the displayed restaurant information!


## Assumptions / doubts
#### "Rating as a number"
I researched multiple avenues for calculating the rating as a number, weighted by the count of reviews. However, since the API returns the restaurants in a random order and I am limiting to 10, there was no way for me to know the _total_ count of reviews across all restaurants, or even just all restaurants in that postcode, in order to come up with a sophisticated formula.

I was able to find [here](https://www.just-eat.ch/en/customerservice/article/how-do-star-ratings-work) that Just Eat's star rating is already weighted based on count of reviews and presumably other metrics, and therefore I made the assumption that the starRating value returned in the API was already a fair way to interpret "rating as a number" for the purpose of this task. Given more time and access to the entire dataset and metrics, I think there is probably a more elegant way to weight this data for the smaller sample size I'm working with, but I hope the starRating value will suffice for the exercise!
#### Data return format
I could have returned restaurant json objects which would have many advantages (flexibility, usability across platforms, easier to integrate with other programmes) but in this case, I prioritised the user-friendliness of my console application and returned restaurant data as text in the console.

## Improvements / potential additions
- Implement error handling for invalid postcode inputs.
- Allow customization of the number of displayed restaurants.
- Add support for filtering restaurants by additional criteria (e.g., cuisine type, rating).

## Contact
For any inquiries or issues, please contact hannahemcs@gmail.com