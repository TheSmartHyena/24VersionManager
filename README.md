Vous devez implémenter une classe VersionManager.
Il doit accepter un paramètre facultatif qui représente la version initiale. L'entrée sera dans l'un des formats suivants : "{MAJOR}", "{MAJOR}.{MINOR}", ou "{MAJOR}.{MINOR}.{PATCH}". D'autres valeurs peuvent être fournies après PATCH, mais elles doivent être ignorées. Si ces 3 parties ne sont pas des nombres (entier), une exception avec le message "Une erreur s'est produite lors de l'analyse de la version !" devrait être jeté. Si la version initiale n'est pas fournie ou est une chaîne vide, utilisez "0.0.1" par défaut.

Cette classe doit prendre en charge les méthodes suivantes, qui doivent toutes pouvoir être chaînées (sauf release) :

major() - augmente MAJOR de 1, met MINOR et PATCH à 0
minor() - augmente MINOR de 1, met PATCH à 0
patch() - augmente PATCH de 1
rollback() - renvoie MAJOR, MINOR et PATCH à leurs valeurs avant l'appel majeur/mineur/patch précédent, ou lève une exception avec le message "Cannot rollback!" s'il n'y a pas de version à restaurer. 

Plusieurs appels à rollback() devraient être possibles et restaurer l'historique des versions
release() - renvoie une chaîne au format "{MAJOR}.{MINOR}.{PATCH}"
