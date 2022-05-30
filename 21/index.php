<?php

if (isset($_POST["submit"])){
    echo strrev($_POST["string"]);
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Otazka 21</title>
</head>
<body>

<form action="" method="post">
<p>Zadejte nejaky text</p>
    <input type="text" name="string">
    <input type="submit" name="submit">
</form>

</body>
</html>