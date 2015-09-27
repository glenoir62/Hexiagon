<%@page import="com.zenixia.plugins.hexiagon.model.Announcement"%>
<%@page import="javax.portlet.PortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.zenixia.plugins.hexiagon.constants.PortletKeys"%>
<%@page import="com.zenixia.plugins.hexiagon.constants.AnnouncementConstants"%>
<%@page import="com.liferay.portal.model.User"%>
<%@include file="/jsp/init.jsp" %>

<%
	PortletURL portletDirectoryURL = null;
	
	// create portletUrl
	portletDirectoryURL = PortletURLFactoryUtil.create(
	renderRequest, PortletKeys.DIRECTORY, PortalUtil.getControlPanelPlid(renderRequest),
	PortletRequest.RENDER_PHASE);
	portletDirectoryURL.setWindowState(LiferayWindowState.POP_UP);
	portletDirectoryURL.setPortletMode(PortletMode.VIEW);
	portletDirectoryURL.setParameter("struts_action", "/directory/view_user");
	portletDirectoryURL.setParameter("tabs1Names", "Info");
%>

<c:set var="portletNamespace">
	<portlet:namespace/>
</c:set>

<style>

	#${portletNamespace}announcement-display .thumbnails .carousel-menu-index {height: auto;margin: auto;width: auto;}
	#${portletNamespace}announcement-display .carousel-item {background-color: white;width: 100%;height:300px;margin: 0;line-height: 250px;vertical-align: middle;}
	#${portletNamespace}announcement-display .carousel-item img {top:0; bottom:0; margin:auto; max-height: 300px;}
	
	#${portletNamespace}announcement-display .accordion-group .accordion-heading {background: #50a2f5 !important;}
	#${portletNamespace}announcement-display .accordion-group .accordion-heading .accordion-toggle {color: white !important;}
	
	#${portletNamespace}announcement-display .taglib-ratings .rating-content .icon-thumbs-down {display: none;}
</style>

<aui:container id="announcement-display">	
	<aui:row>
		<aui:col width="60">
			<aui:row cssClass="text-center">
				<div id='<portlet:namespace/>${announcementImage.announcementId}carousel' class="span12">
					<c:forEach var="announcementImage" items="${announcementImages}">
						<div class="carousel-item">
							<c:set value="${announcementImage.getDescription(locale)}" var="imageDescription" />
							<c:set value="${announcementImage.getImageURL(themeDisplay)}" var="imageUrl" />

							<a href="${announcementImage.getImageURL(themeDisplay)}" title="${imageDescription}">
								<img id="${announcementImage.announcementId}" alt="${imageDescription}" src="${imageUrl}">
							</a>
						</div>
					</c:forEach>
				</div>
			</aui:row>
			<aui:row >
				<div class="span12">
					<aui:row fluid="true" id="${announcementImage.announcementId}menu">
						<!-- Bottom switcher of slider -->
						<ul class="thumbnails">
							<c:forEach var="announcementImage" items="${announcementImages}">
								 <li class="span4">
							        <a href="#" class="thumbnail menu-item carousel-menu-index" >
							        	<img id="${announcementImage.announcementId}" alt="${announcementImage.getDescription(locale)}" src="${announcementImage.getImageURL(themeDisplay)}">
							        </a>
							    </li>
			 				</c:forEach>
			            </ul>
					</aui:row>
				</div>
			</aui:row>
		</aui:col>
		<aui:col width="40">
			<aui:row fluid="true" cssClass="span12">
				<liferay-ui:panel iconCssClass="icon-circle-blank" defaultState="open" extended="true" id="${portletNamespace}announcementCategory1" persistState="false" title="announcement-user">
					<div class="span3">
						<a class="${favorite}" href="" onclick="<portlet:namespace/>showUserInfo(${announcement.userId});return false;">
							<img src="${user.getPortraitURL(themeDisplay)}>" alt="" class="img-rounded">
						</a>
					</div>
					<div class="span8 offset1">
						<blockquote>
							<p>${user.getFullName()}</p>
							<c:forEach var="address" items="${user.getAddresses()}">xz
								<small>
									<cite title="Source Title">${address.getStreet1()} ${address.getCity()} ${address.getRegion().getName()} ${address.getCountry().getName(locale)} <i class="icon-map-marker"></i>
									</cite>
								</small>
							</c:forEach>
						</blockquote>
						<p>
							<c:if test="${not empty announcement.getEmailAddress()}">
								<i class="icon-envelope"></i>
								<a href="mailto:${announcement.getEmailAddress()}?Subject=${announcement.getTitle(locale)}" target="_top">
									<liferay-ui:message key="send-text-message" />
								</a>
								<br>
							</c:if>
							<c:if test="${not empty announcement.getPhoneNumber()}">
							<i class="icon-phone"></i>
								${announcement.getPhoneNumber()}
							</c:if>
						</p>
					</div>
					<div style="clear: both;"/>
				</liferay-ui:panel>
				<br>
				<liferay-ui:panel iconCssClass="icon-circle-blank" defaultState="open" extended="true" id="${portletNamespace}announcementCategory2" persistState="false" title="announcement-info">
					<p class="well"><strong><liferay-ui:message key="Price"></liferay-ui:message> : ${announcement.price} ${announcement.getCurrencySymbol()}</strong></p>
					
					<p><span class="icon-stack" style="color:#00a2fb">
					<i class="icon-sign-blank icon-stack-base "></i>
		 			<i class="icon-cloud icon-light" ></i>
					</span> &nbsp;<liferay-ui:message key="Type"></liferay-ui:message>: ${announcement.getType().getName(locale)}</p>
					
					<p><span class="icon-stack" style="color:#00a2fb">
					<i class="icon-sign-blank icon-stack-base "></i>
		 			<i class="icon-money icon-light" ></i>
					</span> &nbsp;<liferay-ui:message key="Price"></liferay-ui:message> : ${announcement.price} ${announcement.getCurrencySymbol()}</p>
					
					<p><span class="icon-stack" style="color:#00a2fb">
					<i class="icon-sign-blank icon-stack-base "></i>
		 			<i class="icon-calendar-empty icon-light" ></i>
					</span> &nbsp;<liferay-ui:message key="create-date"></liferay-ui:message>: <fmt:formatDate type="both" value="${announcement.createDate}" /></p>
					
					<p><span class="icon-stack" style="color:#00a2fb">
					<i class="icon-sign-blank icon-stack-base "></i>
		 			<i class="icon-calendar icon-light" ></i>
					</span> &nbsp;<liferay-ui:message key="modified-date"></liferay-ui:message>: <fmt:formatDate type="both" value="${announcement.modifiedDate}" /></p>
					
					<p><span class="icon-stack" style="color:#00a2fb">
					<i class="icon-sign-blank icon-stack-base "></i>
		 			<i class="icon-tags icon-light" ></i>
					</span>
						<liferay-ui:asset-categories-summary
						className="<%= Announcement.class.getName() %>"
						classPK="${announcement.announcementId}"/>
					</p>
	
				</liferay-ui:panel>
				<br>
				<liferay-ui:panel iconCssClass="icon-circle-blank" defaultState="open" extended="true" id="${portletNamespace}announcementCategory3" persistState="false" title="announcement-meta">
					<c:if test="${themeDisplay.isSignedIn()}">
						<c:set var="favorite" value="icon-star-empty icon-large" />
					
						<c:if test="${announcement.isFavorite(themeDisplay.userId)}">
							<c:set var="favorite" value="icon-star icon-large" />
						</c:if>
						
						<p class="action">
							<liferay-ui:message key="favorites"/> ?
							<br>
							<a href="" class="${favorite}" onclick="<portlet:namespace/>updateFavoriteUrl(this);return false;">
							</a>
						</p>
					</c:if>
					
					<liferay-ui:ratings
						className="<%= Announcement.class.getName() %>"
						classPK="${announcement.announcementId}"
						type="thumbs"
					/>
					
					<br>
					<br>
					<br>
					<liferay-ui:flags
						className="<%= Announcement.class.getName() %>"
						classPK="${announcement.announcementId}"
						contentTitle="${announcement.getTitle(locale)}"
						reportedUserId="${user.userId}"
					/>
					<hr>
					<liferay-ui:asset-links
						className="<%= Announcement.class.getName() %>"
						classPK="${announcement.announcementId}"
					/>
				</liferay-ui:panel>
			</aui:row>
		</aui:col>
	</aui:row>
</aui:container>

<hr>

<aui:row>
	<h5><i class="icon-align-left"></i>&nbsp;<liferay-ui:message key="Description"></liferay-ui:message> </h5>
	<aui:col span="12"> 
		<p class="text-left">
			${content}
		</p>
	</aui:col>
</aui:row>

<hr>

<liferay-portlet:resourceURL id="updateFavoriteAnnouncement" var="updateFavoriteAnnouncementURL" portletName="<%= PortletKeys.ANNOUNCEMENT_DISPLAY_PORTLETID %>" plid="<%= PortalUtil.getControlPanelPlid(themeDisplay.getCompanyId()) %>" >

</liferay-portlet:resourceURL>

<aui:script use="liferay-portlet-url">
	
	Liferay.provide(window,'<portlet:namespace/>showUserInfo',function(userId) {
	
		if (userId) {
			var portletURL = '<%= portletDirectoryURL.toString() %>';
			var namespace = Liferay.Util.getPortletNamespace('<%= PortletKeys.DIRECTORY %>');
			portletURL = portletURL + '&' + namespace + 'p_u_i_d' + '=' + userId;
			Liferay.Util.openWindow (
				{
					dialog: {
						destroyOnHide: true,
						width: '50%',
						height: 450
					},
					title: Liferay.Language.get("User"),
					id: '<portlet:namespace/>window-directory-user',
					uri: portletURL
				}
			);
		}
	});
	<c:if test="${not empty announcementImages}">
		YUI().use(
		  'aui-carousel',
		  function(Y) {
		    new Y.Carousel(
		      {
		        contentBox: '#<portlet:namespace/>${announcementImage.announcementId}carousel',
		        height: 300,
		        nodeMenu: '#<portlet:namespace/>${announcementImage.announcementId}menu',
		        nodeMenuItemSelector: '.menu-item',
		        playing : false
		      }
		    ).render();
		  }
		);
		
		YUI().use(
		  'aui-image-viewer-gallery',
		  function(Y) {
		    new Y.ImageGallery(
		      {
		        delay: 2000,
		        links: '#<portlet:namespace/>${announcementImage.announcementId}carousel .carousel-item a',
		        lockScroll: true,
		        preloadAllImages: true,
		        showInfo: true,
		        playing : false,
		        pagination: {
		          total: <%= AnnouncementConstants.IMAGE_LIMIT %>
		        }
		      }
		    ).render();
		  }
		);
	</c:if>
	
	Liferay.provide(window,'<portlet:namespace />updateFavoriteUrl',function(node) {
		var className = node.className;
		
		YUI().use('aui-io-request','node', function (Y) {
			Y.io.request(
			      '${updateFavoriteAnnouncementURL}',
			      {
			        dataType: 'text/html',
			        method: 'POST',
			        data: {
							<portlet:namespace />favorite : className,
							<portlet:namespace />announcementId : ${announcement.announcementId}
						},
			        on: {
			          success: function() {
							if (className == 'icon-star-empty icon-large') {
								node.className = 'icon-star icon-large';
							}
							else if (className == 'icon-star icon-large') {
								node.className = 'icon-star-empty icon-large';
							}
			          }
			        }
			     }
			);
		});
	});
</aui:script>