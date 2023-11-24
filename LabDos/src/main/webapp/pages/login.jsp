<jsp:include page="../layouts/default.jsp" />
<div class="uk-container">
    <div class="uk-position-center uk-padding uk-card-default">
        <div class="uk-width-xlarge">
            <form action="${pageContext.request.contextPath}/CheckAuth" method="post">
                <h4 class="uk-heading-line uk-text-center"><span>welcome back</span>!</h4>
                <h5 class="uk-margin-small-bottom">username</h5>
                <label>
                    <input type="text" class="uk-input" placeholder="username" name="username">
                </label>
                <h5 class="uk-margin-small-bottom">password</h5>
                <label>
                    <input type="password" class="uk-input" placeholder="password" name="password">
                </label>
                <div class="uk-text-right uk-margin-top">
                    <button type="submit" class="uk-button uk-button-primary">
                        Register
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>
<jsp:include page="../layouts/footer.jsp" />
