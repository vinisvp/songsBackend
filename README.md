# Songs Backend

Path: http://localhost:8080/songs

#### Endpoints:

GET (all): http://localhost:8080/songs <br>
GET (by id): http://localhost:8080/songs/{id} <br>
POST: http://localhost:8080/songs <br>
DELETE: http://localhost:8080/songs/{id} <br>
PUT: http://localhost:8080/songs/{id} (with a resquest body)<br>
<br>
Example of request body:
```
{
  "name": "Last Resort and Spa",
  "album": "Form",
  "length": "4:14",
  "artist": "Battle Tapes",
  "genre": "Dance, Eletrônica"
}
```
