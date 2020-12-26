/*
  처음 index.html을 로딩 시 모든 localStorage를 삭제 해 주세요
 */

//localStorage.clear();









function setCookie(cname, cvalue, exdays) {
	  var d = new Date();
	  d.setTime(d.getTime() + (exdays*24*60*60*1000));
	  var expires = "expires="+ d.toUTCString();
	  document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
	}
	 
	function getCookie(cname) {
		  var name = cname + "=";
	  var decodedCookie = decodeURIComponent(document.cookie);
	  var ca = decodedCookie.split(';');
	  for(var i = 0; i <ca.length; i++) {
	    var c = ca[i];
	    while (c.charAt(0) == ' ') {
	      c = c.substring(1);
	    }
	    if (c.indexOf(name) == 0) {
	      return c.substring(name.length, c.length);
	    }
	  }
	  return decodedCookie;
	}

	function deleteCookie(cookieName)
	{
	 var expireDate = new Date();
	 
	 //어제 날짜를 쿠키 소멸 날짜로 설정한다.
	 expireDate.setDate( expireDate.getDate() - 1 );
	 document.cookie = cookieName + "= " + "; expires=" + expireDate.toGMTString() + "; path=/";
	}
	function setLStorage(key, val){	
		localStorage.setItem(key, val);	
	}


	function btnClick(){
		setCookie("exp_popup","yes",1);
	}
	function btnCheck(){
		alert(getCookie("exp_popup"));
	}







/*
 스토리지의 모든 키, 값을 가져오기 
 */

function allStorage() {
	for(var i=0;i<localStorage.length;i++){
		 var key = localStorage.key(i);
		 var val = localStorage.getItem(key);
	}
	
}
