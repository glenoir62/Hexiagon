<%@page import="com.gleo.plugins.hexiagon.model.Announcement"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@include file="/jsp/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<liferay-ui:header
	backURL="${redirect}"
	title='${title}'
/>

<aui:model-context bean="${announcement}" model="${model}" />

<portlet:actionURL var="editAnnouncementURL" windowState="normal" name="${actionName}">
	<portlet:param name="redirect" value="${redirect}"/>
</portlet:actionURL>

<liferay-ui:success key="announcement-added" message="announcement-added"/>
<liferay-ui:success key="announcement-updated" message="announcement-updated"/>
<liferay-ui:success key="announcement-deleted" message="announcement-deleted"/>

<liferay-ui:error key="announcement-errors" message="announcement-errors" />

<aui:form action="${editAnnouncementURL}" enctype="multipart/form-data" method="POST" name="fm">
	<aui:fieldset>
		<aui:input type="hidden" name="redirect" value='${redirect}' />
		<aui:input type="hidden" name="announcementId"/>

		<liferay-ui:error key="announcementtitle-required" message="announcementtitle-required" />
		<aui:input name="title" />
		<hr>
		
		<liferay-ui:error key="announcementtype-required" message="announcementtype-required" />
		<aui:field-wrapper name="typeId" label="Type" inlineField="right">
			<c:forEach var="type" items="${types}">
				<aui:input inlineField="true" type="radio" label="${type.getName(locale)}" name="typeId" value="${type.getTypeId()}" checked="${announcement.typeId eq type.typeId}"/>
			</c:forEach>
		</aui:field-wrapper>
		<hr>
		
		<liferay-ui:panel iconCssClass="icon-info" defaultState="open" extended="true" id="announcementInfo" persistState="false" title="Informations">
			<aui:row>					 
				<aui:col span="4" >
					<aui:row fluid="true">
						<liferay-ui:error key="announcementprice-required" message="announcementprice-required" />
						<aui:input name="price"/>
					</aui:row>
					
					<aui:row fluid="true">
						<aui:select name="currencyId" label="Currency" showEmptyOption="true" >
							<c:forEach var="currency" items="${currencies}">
								<aui:option label="${currency.getSymbol()}" value="${currency.getCurrencyId()}" ></aui:option>
				 			</c:forEach>
						</aui:select>
					</aui:row>
				</aui:col>
				
				<aui:col span="4">
					<liferay-ui:error key="announcementemail-required" message="announcementemail-required" />
					<liferay-ui:error key="announcementemail-format-error"	message="announcementemail-format-error" />
					
					<aui:input name="emailAddress" />
			
					<liferay-ui:error key="announcementphonenumber-required" message="announcementphonenumber-required" />
					<liferay-ui:error key="announcementphonenumber-format-error" message="announcementphonenumber-format-error" />
					
					<aui:input name="phoneNumber" />
				</aui:col>
				
				<aui:col span="4">
					<aui:select label="country" name="countryId" showEmptyOption="true" />
		
					<aui:select label="region" name="regionId" showEmptyOption="true" />
				</aui:col>
			</aui:row>
		</liferay-ui:panel>
		
		<liferay-ui:panel iconCssClass="icon-sitemap" defaultState="open" extended="true" id="announcementCategorizationPanel" persistState="false" title="Categories">
			<aui:field-wrapper>
					<liferay-ui:asset-categories-selector classPK="${announcement.announcementId}" className="${model.getName()}" ></liferay-ui:asset-categories-selector>
			 </aui:field-wrapper>
		</liferay-ui:panel>
		
		<br>
		<liferay-ui:error key="announcementcontent-required" message="announcementcontent-required" />
		<aui:field-wrapper label="content" name="editor">
			<liferay-ui:input-editor name="editor" resizable="true"></liferay-ui:input-editor>
		</aui:field-wrapper>
		
		<aui:row>
		<c:forEach begin="1" end="${imageLimit}" var="index">
			<div class="span4">
			<c:set value="${announcementImages[index]}" var="announcementImage" />
			
			<liferay-ui:error key="image-size-error${index}" message="announcement-image-size-error" />
			<liferay-ui:error key="image-extension-error${index}" message="announcement-image-extension-error" />
	     	<liferay-ui:panel iconCssClass="icon-picture" defaultState="open" extended="true" id="announcementAbstractPanel${index}" persistState="false" title=" Image ${index}">
					<aui:input type="hidden" name="announcementImageId${index}" value='${announcementImage.announcementImageId}' />
					<aui:input type="hidden" name="imageDisabled${index}" value="false"/>
					<aui:input type="hidden" name="order" value="false"/>
							
					<a class="btn btn-warning" href="javascript:;" id="<portlet:namespace/>${index}DeleteImage" onclick="<portlet:namespace/>${index}DeleteImage();">
						<liferay-ui:message key="delete"/>
					</a>
					<br>
					<br>
					
					<div id="<portlet:namespace/>placeholderImage${index}" class="text-center well">
						<c:set value="${announcementImages[index]}" var="announcementImage" />
						
						<c:set value="<%= themeDisplay.getScopeGroupName() %>" var="announcementImageDescription" />
						<c:set value="<%= themeDisplay.getCompanyLogo() %>" var="announcementImageUrl" />
						
						<c:if test="${announcementImage ne null}">
							<c:set value="${announcementImage.getImageURL(themeDisplay)}" var="announcementImageUrl" />
							<c:set value="${announcementImage.getDescription(locale)}" var="announcementImageDescription" />
						</c:if>
						<img id="<portlet:namespace/>${index}Image" style="max-width: 150px;" class="img-rounded" alt="${announcementImageDescription}" src="${announcementImageUrl}" />
					</div>
					
					<br>
					<aui:input type="hidden" name="announcementImageUrlSrc${index}" value="${announcementImageUrl}"></aui:input>
					
					<aui:input type="hidden" name="order" value="false"/>
					<aui:script use="aui-base">
						
						Liferay.provide(
								window,
								'<portlet:namespace/>${index}DeleteImage',
								function() {
									var A = AUI();
						
									var buttonText = 'cancel';
									var disabled = true;
						
									var imageInputNode = A.one('#<portlet:namespace/>image${index}');
						
									if (imageInputNode.get('disabled')) {
										buttonText = 'delete';
										disabled = false;
										
									}
									
									A.one('#<portlet:namespace/>${index}DeleteImage').setContent(buttonText);
									A.one('#<portlet:namespace/>imageDisabled${index}').attr('value', disabled);
						
									imageInputNode.attr('disabled', disabled);
						
									A.one('#<portlet:namespace/>${index}Image').toggle();
								},
								['aui-base']
							);
					</aui:script>
	
					<aui:fieldset>
						<aui:input inlineField="true" name="image${index}" type="file" label="Image"/>
						<aui:script use="aui-base">
							A.one('#<portlet:namespace/>image${index}').on('change',function(event){
								var id = this.attr('id');
				            	var input = document.getElementById(id);
				            	
								if (input.files && input.files[0]) {
							       var reader = new FileReader();
							       
							       reader.onload = function (e) {
							       		
							       		A.one('#<portlet:namespace/>announcementImageUrlSrc${index}').val(e.target.result);
							       		
							       		if (A.one('#<portlet:namespace/>${index}Image')) {
							       			A.one('#<portlet:namespace/>${index}Image').attr('src', e.target.result);
							       		} else {
							       			A.one('#<portlet:namespace/>placeholderImage${index}').append(A.Node.create('<img id="<portlet:namespace/>${index}Image" class="img-rounded" alt="${announcementImage.getDescription(locale)}" src="'+ e.target.result +'" />'));
							       		}
							       		
							       }
							       reader.readAsDataURL(input.files[0]);
							   }
							});
						</aui:script>
					</aui:fieldset>
					
					<aui:fieldset>
						<c:set value="${announcementImage}" var="bean" />
						
						<c:if test="${bean eq null}">
							<c:set value="${imageBean}" var="bean" />
						</c:if>
						<aui:input helpMessage="describe-your-announcement-for-visually-impaired" inlineField="true" label="Description" field="description" name="description${index}" id="description${index}" fieldParam="description${index}" model="${imageModel}" bean="${bean}" />
					</aui:fieldset>

			</liferay-ui:panel>
			</div>
		</c:forEach>
		</aui:row>
		
		<div style="clear: both;" />
		<br>
		<br>
		
		<liferay-ui:error key="announcementagreement-required" message="announcementagreement-required" />
		<aui:field-wrapper name="agreement" label="Agreement" inlineField="right">
			<aui:input name="agreement" type="checkbox" label="approve-agreement" checked="${announcement ne null}">
			</aui:input>
			<br>
			<aui:a href="${previewFileURL}" label="show-agreement" target="_blank" />
		</aui:field-wrapper>
	</aui:fieldset>
	
	<c:if test="${announcement eq null}">
		<aui:field-wrapper label="permissions">
			<liferay-ui:input-permissions
				modelName="${model.getName()}"
				/>
		</aui:field-wrapper>
	</c:if>
	
		
	<liferay-ui:panel defaultState="closed" extended="<%= false %>" id="artistAssetLinksPanel" persistState="<%= true %>" title="related-assets">
		<aui:fieldset>
			<liferay-ui:input-asset-links
				className="<%= Announcement.class.getName() %>"
				classPK="${announcement.announcementId}"
			/>
		</aui:fieldset>
	</liferay-ui:panel>
	
	<aui:button-row>
		<aui:button type="button" cssClass="btn btn-info" onClick="${renderResponse.getNamespace()}preview();" value="Preview"></aui:button>
		<aui:button type="submit" cssClass="btn btn-primary" onClick="${renderResponse.getNamespace()}extractCodeFromEditor();" />

		<aui:button type="cancel" onClick="${redirect}"/>
	</aui:button-row>
</aui:form>

<portlet:resourceURL var="loadPreviewURL" id="loadPreview">
	<portlet:param name="action" value="loadPreview"/>
</portlet:resourceURL>

<aui:script use="aui-base,aui-form-validator,liferay-form,liferay-dynamic-select">

	A.config.FormValidator.STRINGS.fileSizeRule ='Image should be < ${fileSizeRule}.';
	
	A.config.FormValidator.RULES.fileSizeRule = function(val, fieldNode, ruleValue) {
	     	var name = fieldNode.attr('id');
	     	var input = document.getElementById(name);
	        var fileSize = input.files[0].size;
	         
	return ((fileSize < ${fileSizeRule}) || fieldNode.get('disabled'));
	 };
	 
	var rules = {
		<portlet:namespace/>title: {
		 	required: true
		},
		<portlet:namespace/>typeId: {
		 	required: true
		},
		<portlet:namespace/>agreementCheckbox: {
		 	required: true
		},
		<portlet:namespace/>editor: {
		 	required: true
		},
		<portlet:namespace/>emailAddress: {
		 	email: true
		},
		<portlet:namespace/>phoneNumber: {
			digits: true,
			minLength: 8,
			maxLength: 10
		},
		<portlet:namespace/>price: {
		 	required: true,
		 	number: true,
		 	range:  [0,${maxPrice}]
		},
		<c:forEach var="vocabularyId" items="${vocabularyIds}">
			<portlet:namespace/>assetCategoryIds_${vocabularyId}: {
				 	required: true
			},
		</c:forEach>
		<c:forEach begin="1" end="${imageLimit}" var="index">
			<portlet:namespace/>image${index}: {
			 	acceptFiles: '${acceptFiles}',
			 	fileSizeRule: true
			},
		</c:forEach>		
	};
	
	var validator = new A.FormValidator({
		boundingBox: document.<portlet:namespace />fm,
		rules: rules,
		validateOnBlur: true
	});
	
	Liferay.provide(window,'<portlet:namespace />preview',function() {
		<portlet:namespace />extractCodeFromEditor();
		
		validator.validate();
		
		if(!validator.hasErrors()){
		
			var popup = Liferay.Util.Window.getWindow({
				dialog: {
					destroyOnHide: true
				},
				title: Liferay.Language.get("preview")
			});
			
			popup.plug(
				A.Plugin.IO,
				{
					uri: '${loadPreviewURL}',
					method: 'POST',
					dataType: 'text/html',
					form: { 
					 	id: A.one('#<portlet:namespace />fm'),
						upload: false
					 }
				}
			);
		}
	});
	
	new Liferay.DynamicSelect(
		[
			{
				select: '<portlet:namespace />countryId',
				selectData: Liferay.Address.getCountries,
				selectDesc: 'nameCurrentValue',
				selectSort: '<%= true %>',
				selectId: 'countryId',
				selectVal: '${countryId}'
			},
			{
				select: '<portlet:namespace />regionId',
				selectData: Liferay.Address.getRegions,
				selectDesc: 'name',
				selectId: 'regionId',
				selectVal: '${regionId}'
			}
		]
	);
</aui:script>

<aui:script>
	function <portlet:namespace />initEditor() {
		return "${content}";
	}
	
	function <portlet:namespace />extractCodeFromEditor() {
	   document.<portlet:namespace />fm.<portlet:namespace />editor.value = window.<portlet:namespace />editor.getHTML();
	}
</aui:script>
 