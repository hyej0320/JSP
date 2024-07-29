const modi_forms = document.getElementBygetElementsByClassName("modi_form");

Array.form(modi_forms).forEach((modi_form) => {
	console.dir(modi_form);
	
	// form.elements에서 name 속성 또는 id 속성으로 폼 내부 요소 선택 가능
	console.dir(modi_form.elements.modi_value);
	console.dir(modi_form.elements.modi_btn);
	
	modi_btn.addEventListener("click", (e) => {
		console.log("btn clicked!");
	});
});