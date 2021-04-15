<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="footer">
        <div class="row no-gutters justify-content-center">
            <div class="col-auto">
                <a href="/home"<c:if test="${fn:contains(itemMenuSelecionado, 'home')}"> class="active" </c:if>  >
                    <i class="material-icons">home</i>
                    <p>Home</p>
                </a>
            </div>
            <div class="col-auto">
                <a href="/jogar" <c:if test="${fn:contains(itemMenuSelecionado, 'jogar')}"> class="active" </c:if>  >
                    <i class="material-icons">play_circle</i>
                    <p>Jogar</p>
                </a>
            </div>
            <div class="col-auto">
                <a href="/recordes" <c:if test="${fn:contains(itemMenuSelecionado, 'recordes')}"> class="active" </c:if>  >
                    <i class="material-icons">list_alt</i>
                    <p>Recordes</p>
                </a>
            </div>
        </div>
    </div>