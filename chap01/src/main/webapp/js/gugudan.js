const gugudanDiv = document.getElementById("gugudan");

for (let gop = 1; gop <= 9; ++gop) {
	for (let dan = 2; dan <= 9; ++dan) {
		const g = document.createElement("div");
		const t = document.createTextNode(`${dan} x ${gop} = ${dan * gop}`);

		g.appendChild(t)				
		gugudanDiv.appendChild(g);
	}
}