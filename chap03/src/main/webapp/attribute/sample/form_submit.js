const loginForm = document.getElementById("loginForm");
const loginBtn = document.getElementById("loginBtn");

const userIdInput = document.getElementById("userIdInput");
const userPwInput = document.getElementById("userPwInput");

loginBtn.addEventListener("click", (e) => {	
	if(!userIdInput.value) {
		alert("아이디를 입력해주세요");
		userIdInput.focus(); // 커서를 해당 요소로 옮기는 메서드
		return;
	} else if (!userPwInput.value) {
		alert("비밀번호를 입력해주세요");
		userPwInput.focus();
		return;
	}
	
	alert("로그인합니다");
	loginForm.submit();
});