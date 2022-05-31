<?php
$servername = "localhost";
$username = "username";
$password = "somepwd";
$dbname = "123987123";

$conn = mysqli_connect($servername, $username, $password, $dbname);
$conn->set_charset("utf-8");

if (!$conn){
    die("Connection failed: " . mysqli_connect_error());
}

$name = $_POST["name"];
$sql = "SELECT grade_event.date, score.score, score.student_id, score.event_id
        FROM grade_event, score, student
        WHERE student.name = '$jmeno' AND student.student_id = score.student_id AND core.event_id";  
$result = mysqli_query($conn, $sql);

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vypis ot24</title>
</head>
<body>

    <?php

    if (mysqli_num_rows($result) > 0){
        while ($row = mysqli_fetch_assoc($result)){
            echo $row;
        }
    } else {
        echo "Dotazu neodpovida zadny zaznam.";
    }

    ?>

</body>
</html>