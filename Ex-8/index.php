<!DOCTYPE html>
<html>
<head>
<title>College Achievements</title>
<style>
table {
width: 100%;
border-collapse: collapse;
}
table, th, td {
border: 1px solid black;
background-color: #FF69B4;
}
th, td {
padding: 8px;
text-align: left;
font-weight: bold;
font-size:20px;
}
th {
background-color: #00DDFF;
}
ul {
list-style-type: square;
}
</style>
</head>
<body>
<h1>College Achievements</h1>
<table>
<tr>
<th>Name</th>
<th>Year</th>
<th>Department</th>
<th>Achievements</th>
</tr>
<?php
// Load the XML file
$xml = simplexml_load_file('sample.xml');
// Check if the XML file was successfully loaded
if ($xml) {
// Loop through each student and display their information
foreach ($xml->student as $student) {
echo "<tr>";
echo "<td>" . $student->name . "</td>";
echo "<td>" . $student->year . "</td>";
echo "<td>" . $student->department . "</td>";
echo "<td>";
echo "<ul>";
foreach ($student->achievements->achievement as $achievement) {
echo "<li>" . $achievement . "</li>";
}
echo "</ul>";
echo "</td>";
echo "</tr>";
}
} else {
echo "<tr><td colspan='4'>Failed to load the XML file.</td></tr>";
}
?>
</table>
</body>
</html>