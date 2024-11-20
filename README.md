curl --location 'http://localhost:8080/api/v1/stripe/create-payment' \
--header 'Content-Type: application/json' \
--data '{
    "amount": 100,
    "quantity": 1,
    "currency": "USD",
    "name": "Mobile"
}'```
```
