## Repository
Un repository est un composant de votre application qui gère les opérations de persistance (CRUD) sur les entités dans une base de donnée . En gros c'est la couche qui nous permet de parler à la BDD sans se soucier des détails

## Annotation @Repository

Elle sert à marquer une classe comme étant un repository, c'est-à-dire un endroit où vous allez interagir avec votre BDD.

## Est-ce obligatoire ?

Non ! Quand on implémente déjà une interface comme `JpaRepository` , Spring détecte automatiquement notre repository.


## @PathVariable vs @RequestBody vs @Requestparam

### @PathVariable
On l'utilise pour extraire une partie variable dans notre chemin d'URL.
### @RequestBody
On l'utilise quand on reçoit des donées via post.
###  @Requestparam
On l'utilise quand on a des paramètres dans l'URL  sous la forme `?param=valeur`.