# springboot-mongodb
poc for spring boot + mongoDB

# installation
1. install mongo or use the latest mongo docker locally, and export the port 27017 (default mongodb port).
2. create a database named 'local' if not already exists, and create a collection called "stam", same as in Person.
3. add a document which has generated id + field named "field" for example
{
  "field": "abc",  
  "_id": {
    "$oid": "62790d4b58c601f6b7b4bb42"
  }
}
4. start spring boot and verify no errors (= success connecting to mongo).
5. go to postman or just use curl if you like to test:
curl --location --request POST 'localhost:8080/demo/test?name=abc' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "abc"
}'
