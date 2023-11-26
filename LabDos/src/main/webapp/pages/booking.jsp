<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../layouts/default.jsp" />
<div class="uk-container uk-margin-medium">
    <h4 class="uk-heading-bullet uk-margin-small-bottom">Make a reservation</h4>
    <div class="uk-margin-bottom">
        <c:forEach items="${resultList}" var="booking" varStatus="status">
            <div class="uk-card uk-margin uk-card-default uk-card-body">
                <h5>Booking # • <c:out value="booking.booking_time"/></h5>
                <hr>
                <span class="uk-heading-line"><span>Amount of guests • <c:out value="booking.booking_amount"/></span></span>
                <span class="uk-heading-line uk-text-center"><span>Booking date • <c:out value="booking.booking_date"/></span></span>
<%--                <c:choose>--%>
<%--                    <c:when test="${booking.approved == '1'}">--%>
<%--                        <span class="uk-heading-line uk-text-right"><span>Status • <span class="uk-text-success">Approved</span></span></span>--%>
<%--                    </c:when>--%>
<%--                    <c:when test="${booking.approved == '0'}">--%>
<%--                        <span class="uk-heading-line uk-text-right"><span>Status • <span class="uk-text-primary">Pending review by administrator</span></span></span>--%>
<%--                    </c:when>--%>
<%--                    <c:when test="${booking.approved == '2'}">--%>
<%--                        <span class="uk-heading-line uk-text-right"><span>Status • <span class="uk-text-danger">Not approved</span></span></span>--%>
<%--                    </c:when>--%>
<%--                </c:choose>--%>
            </div>
        </c:forEach>
    </div>
    <h4 class="uk-heading-bullet uk-margin-small-bottom">Make a reservation</h4>
    <div class="uk-card uk-card-body uk-card-default">
        <form action="${pageContext.request.contextPath}/CreateBookingServlet" method="post">
            <div class="uk-flex uk-flex-center uk-flex-middle">
                <div class="uk-width-1-2">
                    <h5 class="uk-margin-small-bottom">Pick a date for reservation</h5>
                    <label>
                        <input type="date" class="uk-input" required name="date">
                    </label>
                </div>
                <div class="uk-margin-left uk-width-1-2">
                    <h5 class="uk-margin-small-bottom">Amount of guests</h5>
                    <label>
                        <input type="number" min="1" max="99" class="uk-input" required name="amount">
                    </label>
                </div>
            </div>
            <div class="uk-text-right uk-margin-top">
                <button type="submit" class="uk-button uk-button-primary">
                    Request a reservation
                </button>
            </div>
        </form>
    </div>
</div>
<jsp:include page="../layouts/footer.jsp" />