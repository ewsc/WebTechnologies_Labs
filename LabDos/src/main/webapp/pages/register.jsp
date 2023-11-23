<jsp:include page="../layouts/default.jsp" />
<div class="uk-container">
    <div class="uk-position-center uk-padding uk-card-default">
        <div class="uk-width-xlarge">
            <h4 class="uk-heading-line uk-text-center"><span>register</span>!</h4>
            <form action="/CreateNewUserServlet" method="post">
                <h5 class="uk-margin-small-bottom">name</h5>
                <label>
                    <input type="text" class="uk-input" placeholder="name" name="name" required>
                </label>
                <h5 class="uk-margin-small-bottom">username</h5>
                <label>
                    <input type="text" class="uk-input" placeholder="username" name="username" required>
                </label>
                <h5 class="uk-margin-small-bottom">password</h5>
                <label>
                    <input type="password" class="uk-input" placeholder="password" name="password" required>
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