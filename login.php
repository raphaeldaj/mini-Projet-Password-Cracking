<?php
$login = $_POST['login'] ?? '';
$password = $_POST['motDePasse'] ?? '';

$correctLogin = 'admin';
$correctPassword = 'passer1234';

if ($login === $correctLogin && $password === $correctPassword) {
    echo "Connexion réussie";
} else {
    echo "Échec de la connexion";
}
?>
