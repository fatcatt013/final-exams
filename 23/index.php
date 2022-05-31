<?php

session_start();

if (isset($_POST["submit"])){
    $_SESSION["jmeno"] = $_POST["jmeno"];
    $_SESSION["heslo"] = $_POST["heslo"];
    echo "Session nastavena";
    echo "<a href=\"logged.php\">Zobrazit session promenne</a>";
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Otazka 23</title>
</head>
<body>
    <form action="index.php" method="post">
        <input type="text" placeholder="Jmeno" name="jmeno">
        <input type="password" placeholder="Heslo" name="heslo">
        <input type="submit" name="submit">
    </form>
    
</body>
</html>