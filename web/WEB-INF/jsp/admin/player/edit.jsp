<%@include file="../header.jsp" %>
        <h1>Edit Player </h1>
        <form role="form">
            <div class="form-group">
                <label>First Name</label>
                <input type="text" name="firstName" class="form-control" value="${player.firstName}" required="required" placeholder="Enter First Name"/>
            </div>
            <div class="form-group">
                <label>Last Name</label>
                <input type="text" name="lastName" class="form-control" value="${player.lastName}" required="required" placeholder="Enter Last Name"/>
            </div>
            <div class="form-group">
                <label>Email</label>
                <input type="text" name="lastName" class="form-control" value="${player.email}" required="required" placeholder="Enter Email"/>
            </div>
            <div class="form-group">
                <label>Squad Position</label>
                <input type="text" name="squadPosition" class="form-control" value="${player.squadPosition}" required="required" placeholder="Enter Position"/>
            </div>
            <div class="form-group">
                <label>Contact No:</label>
                <input type="text" name="contactNo" class="form-control" value="${player.contactNo}" required="required" placeholder="Enter Contact Number"/>
            </div>
            
        </form>
        
<%@include file="../footer.jsp" %>