<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <h2>Welcome, <%= session.getAttribute("username") %></h2>
    <p>This is a protected resource.</p>
    <a href="logout">Logout</a>
</body>
</html>