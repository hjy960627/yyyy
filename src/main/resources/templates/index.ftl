<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>工号</td>
            <td>姓名</td>
            <td>工资</td>
        </tr>
        <#list ts as T1>
            <tr>
                <td>${T1.id}</td>
                <td>${T1.name}</td>
                <td>${T1.salary}</td>
            </tr>
        </#list>
    </table>
</body>
</html>