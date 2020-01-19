# quotes

## Book 
 - Instantiates a book object which can read a file
 
 ## Quote
  - Contains a toString method which writes out a quote and author to the console
  - Instantiates a quote object
  
 ## App
  - getQuoteOnline will query the ron-swanson-quotes API, instantiate a new Quote object and then return it to the terminal as a string. It will also save this new Quote object to the recentquotes.json file. If unable to connect with the API it will call the readBookQuote method.
  - readBookQuote will transform the recentquotes.json file from json to a Quote Array, it will call the generateRandomInt method and return the Quote at that index of the array.
  - generateRandomInt takes in a max value and will generate a random number up to that maximum value.
  
  ------------------------------------------------------------------------------------------------------------------------
  ### Testing
  
  Run ```./gradlew run``` in the terminal to get a quote from Ron Swanson, repeating this command should return a new quote. If not connected to the internet you will recieve a message saying you are reciving a local quote.
