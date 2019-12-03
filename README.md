# java-maven
Clean et Build "bankonet" : 
```
  mvn clean package && java -jar target/bankonet-1.0-SNAPSHOT.jar

```

Create Client :POST http://localhost:8080/client/create    
```json
{
	"identifiant":"Client 01",
	"nom": "Client A",
	"prenom": "Decembre"
}
```

Get 1 Client :GET http://localhost:8080/client/get/1     
Get all Client :GET http://localhost:8080/client/all    
Delete 1 Client :DELETE http://localhost:8080/client/delete/2        
Update 1 Client :PUT http://localhost:8080/client/update/2    

```json
{
	"id": 2,
	"identifiant":"Client 02",
	"nom": "Client B",
	"prenom": "Vendredi"
}
```

Create CompteCourant :POST http://localhost:8080/compteCourant/create
```json
{
	"numero":"09874665",
	"intitule": "Compte Courant",
	"solde": 1200.00,
	"montantDecouvertAutorise": 500.00,
	"client": {
		"id": 5
	}
}
```

Get 1 CompteCourant :GET http://localhost:8080/compteCourant/get/1      
Get all CompteCourant :GET http://localhost:8080/compteCourant/all      
Delete 1 CompteCourant :DELETE http://localhost:8080/compteCourant/delete/1            
Update 1 CompteCourant :PUT http://localhost:8080/compteCourant/update/1   
```json
{
	"numero":"09874665",
	"intitule": "Compte Courant",
	"solde": 1200.00,
	"montantDecouvertAutorise": 500.00,
	"client": {
		"id": 2
	}
}
``` 

Create CompteEpargne :POST http://localhost:8080/CompteEpargne/create
```json
{
	"numero":"09874665",
	"intitule": "Compte Epargne",
	"solde": 1200.00,
	"tauxInteret": 2.0,
	"client": {
		"id": 5
	}
}
```

Get 1 CompteEpargne :GET http://localhost:8080/CompteEpargne/get/1     
Get all CompteEpargne :GET http://localhost:8080/CompteEpargne/all     
Delete 1 CompteEpargne :DELETE http://localhost:8080/CompteEpargne/delete/1   
Update 1 CompteEpargne :PUT http://localhost:8080/CompteEpargne/update/1   
```json
{
	"numero":"09874665",
	"intitule": "Compte Epargne",
	"solde": 1200.00,
	"tauxInteret": 2.0,
	"client": {
		"id": 2
	}
}
``` 