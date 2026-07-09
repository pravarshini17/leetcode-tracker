-- Last updated: 7/9/2026, 10:10:24 AM
SELECT 
    Person.firstName,
    Person.lastName,
    Address.city,
    Address.state
FROM Person
LEFT JOIN Address
ON Person.personId = Address.personId;
