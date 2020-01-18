var globalStr = "전역변수 str";
globalStr3 = "전역변수 str3";
document.write("globalStr3: " + globalStr3, "<br>");
document.write("globalStr3: " + window.globalStr3, "<br>");
//topic2추가코드
document.write("globalStr3: " + globalStr3, "<br>");
//function선언333
//function 함수명(매개변수1, 매개변수2, ..., 매개변수n) { }
function alertMsg(param) {
    document.write("------ alertMsg() 시작 -------", "<br>");
    //function 안에 var 키워드로 선언된 변수는 지역변수
    //function 안에서만 사용 가능
    var localStr = "지역변수 str";
    document.write("localStr: " + localStr, "<br>");
    
    document.write("매개변수(param)로 전달된 값: " + param, "<br>");
    
    //function 안에 var 키워드가 없이 선언된 변수(글로벌변수)
    globalStr2 = "function내에 선언된 변수";
    
    document.write("\n------ alertMsg() 끝 -------", "<br>");
}
alertMsg("test"); //함수호출 - 함수명(매개변수값)
document.write("<hr>");
document.write("globalStr: " + globalStr, "<br>");
document.write("globalStr2: " + globalStr2, "<br>");

document.write("<hr>");
document.write("오류 발생시킬 예정", "<br>");
document.write("localStr: " + localStr); //오류발생 로컬변수 참조
document.write("globalStr: " + globalStr, "<br>");
document.write("globalStr2: " + globalStr2, "<br>");