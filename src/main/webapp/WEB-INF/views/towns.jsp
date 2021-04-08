<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    		<link
    		href="https://fonts.googleapis.com/css?family=JosephinSansheet&display=swap"/>
    		<link rel="stylesheet" href="style.css"/>
    		<title>Towns List</title>
    </head>

    <body>
        <form action="towns.do" method ="POST">
            <h2>Hello World!</h2>
            <table>
                <tr>
                    <td>
                        <label>Please enter The first letter</label>
                    </td>
                    <td><input type ="text" name="starting_letter"/></td>
                </tr>
                <tr>
                    <td><label>Please enter The first letter</label></td>
                    <td>
                        <select name="townList" id="townList">
                          <option value="select">Please Select</option>
                          <option value="${name}"/>Volvo</option>
                        </select
                    </td>
                    <td>
                        <div class="btn-wrapper">
                            <button class="btn" action="updateBooking">
                                <span class="btn-text-one">Update</span>
                            </button>
                        </div>

                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
