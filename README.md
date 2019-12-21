# graphql
projects related to GraphQL

The application is now ready for testing. Run the Spring Boot application, and open this link — http://localhost:8080/graphiql — in the browser.


Now, run the following query.
```
mutation {
  createVehicle(type: "car", modelCode: "XYZ0192", brandName: "XYZ", launchDate: "2016-08-16") 
  {
    id
  }
}

```

This will create a row in the Vehicle table. The result should be:

```
{
  "data": {
    "createVehicle": {
      "id": "1"
    }
  }
}

```

Let's now run a query to get the data.

```
query {
  vehicles(count: 1) 
  {
    id, 
    type, 
    modelCode
}
}
```

The output will be:

```
{
  "data": {
    "vehicles": [
      {
        "id": "1",
        "type": "bus",
        "modelCode": "XYZ123"
      }
    ]
  }
}
```
