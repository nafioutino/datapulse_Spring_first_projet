## Repository
Un repository est un composant de votre application qui gère les opérations de persistance (CRUD) sur les entités dans une base de donnée . En gros c'est la couche qui nous permet de parler à la BDD sans se soucier des détails

## Annotation @Repository

Elle sert à marquer une classe comme étant un repository, c'est-à-dire un endroit où vous allez interagir avec votre BDD.

## Est-ce obligatoire ?

Non ! Quand on implémente déjà une interface comme `JpaRepository` , Spring détecte automatiquement notre repository.