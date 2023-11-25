<jsp:include page="../layouts/default.jsp" />
<div class="uk-container">
    <div class="uk-position-center uk-padding uk-card-default">
        <div class="uk-width-xlarge">
            <form action="${pageContext.request.contextPath}/CheckAuth" method="post">
                <h4 class="uk-heading-line uk-text-center"><span>Welcome back!</span></h4>
                <span class="uk-margin-small uk-text-center uk-text-danger uk-text-small">${error}</span>
                <h5 class="uk-margin-small-bottom">Username</h5>
                <label>
                    <input type="text" class="uk-input" placeholder="Username..." name="username">
                </label>
                <h5 class="uk-margin-small-bottom">Password</h5>
                <label>
                    <input type="password" class="uk-input" placeholder="Password..." name="password">
                </label>
                <div class="uk-text-right uk-margin-top">
                    <button type="submit" class="uk-button uk-button-primary">
                        Login
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>
<jsp:include page="../layouts/footer.jsp" />
