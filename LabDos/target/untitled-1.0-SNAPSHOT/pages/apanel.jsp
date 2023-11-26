<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>\
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<jsp:include page="../layouts/default.jsp" />
<div class="uk-container uk-margin-medium uk-margin-large-bottom">
    <h4 class="uk-heading-bullet uk-margin-small-bottom">Current bookings</h4>
    <div class="uk-margin-bottom">
        <c:if test="${empty allBookings}">
            <div class="uk-card uk-margin uk-card-default uk-card-body uk-card-small">
                <h5 class="uk-text-bolder uk-text-danger uk-text-italic uk-text-center">Looks like there is nothing to display...</h5>
            </div>
        </c:if>
        <c:forEach items="${allBookings}" var="record" varStatus="recordStatus">
            <div class="uk-card uk-margin uk-card-default uk-card-body uk-card-small">
                <h5 class="uk-text-bolder">Booking #<c:out value="${record.id}"/> from <i><c:out value="${record.booking_time}"/>, order by <i class="uk-text-bolder"><c:out value="${record.booking_from}"/></i></i></h5>
                <hr>
                <div>
                    Amount of guests: <i><c:out value="${record.booking_amount}"/></i> • Booking date: <i><c:out value="${record.booking_date}"/></i> •
                    <c:if test="${record.approved eq 1}">
                        Status: <span class="uk-text-success uk-text-italic">Approved</span>
                    </c:if>
                    <c:if test="${record.approved eq 0}">
                        Status: <span class="uk-text-primary uk-text-italic">Pending review by administrator</span>
                    </c:if>
                    <c:if test="${record.approved eq 2}">
                        Status: <span class="uk-text-danger uk-text-italic">Not approved</span>
                    </c:if>
                </div>
                <div class="uk-margin-top">
                    Set new status:
                    <form action="${pageContext.request.contextPath}/ChangeStatusServlet" method="post">
                        <input type="hidden" name="book_id" value="<c:out value="${record.id}"/>">
                        <select name="approved" class="uk-select" onchange="this.form.submit()">
                            <option value="" disabled selected>New status</option>
                            <option value="1">Approved</option>SS
                            <option value="2">Not approved</option>
                        </select>
                    </form>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
<jsp:include page="../layouts/footer.jsp" />
