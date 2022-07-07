# Pokedex
API REST to consume PokeApi


Endpoints to consume API:
http://52.90.90.72:8080/pokemon/pokeById/?id=  (GET method with id param from front to deploy pokemon specific info)
http://52.90.90.72:8080/pokemon/generalInfo/?offset= (GET method with offset param from front paginator to deploy pokemons)



AWS DEPLOYMENT:

The solution to expose the solution was an EC2 instance in AWS Cloud, it was configured with a OS Windows server and it deploys the .jar from the SpringBoot project compiled and builded with Maven. The instnace was setting up with the SG rules to allow the traffic and get some features like rdp control to install every resource nedeed.
