# Cama API
[![CircleCI](https://circleci.com/gh/satuk/cama-api.svg?style=shield)](https://circleci.com/gh/satuk/cama-api/tree/master)
[![Code Climate](https://img.shields.io/codeclimate/coverage/github/triAGENS/ashikawa-core.svg)](https://codeclimate.com/github/satuk/cama-api)

## Documentation
___
tbd: description
___

## Domain.model
![domain.model](https://github.com/satuk/cama-api/blob/master/new-domain-model.png)

## API

```javascript       
GET  /api/events
```

Retrieves a list of all Events. 

```javascript
GET /api/events/{id}
```
Retrieves one specific Event with all the information.

```javascript       
GET  /api/companies/
```

Retrieves a list of all Companies.

```javascript
GET /api/companies/{id}
```
Retrieves one specific Company with all the information.

```javascript
GET /api/companies/{id}/events
```
Retrieves all Events of one Company.
