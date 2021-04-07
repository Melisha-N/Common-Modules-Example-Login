function validateUserName() {
	var usrname = document.validation.userName.value;
	var email = document.validation.emailId.value;
	var contact = document.validation.contactNo.value;
	var date = document.validation.dob.value;
	var gen = document.validation.gender.value;
	var pswd = document.validation.password.value;
	var cnfpswd = document.validation.confirmPassword.value;
	//var pass = /^(?=.\d)(?=.[a-z])(?=.*[A-Z]).{6,20}$/;
	
	var status = false;

	if (usrname == "" || usrname == null || usrname < 3|| usrname > 18 ) {
		document.getElementById("userNamelocation").innerHTML = "Please enter valid User Name";
		document.getElementById("userNamelocation").innerHTML = alert("User name should not be null and it should be >3 & <18")
		status = false;
	}
	else if(email.length < 3 || email.length >56){
		document.getElementById("emaillocation").innerHTML = "Please enter valid Email Id";
		status = false;
	}
	else if(contact.length < 10 || contact.search(/[0-9]/) == -1){ 
		document.getElementById("contactNolocation").innerHTML = "Please enter valid Contact No.";
		document.getElementById("contactNolocation").innerHTML = alert("Contact No. should be min 10 digits");
		status = false;
	}
	else if(date == "" || date == null){
		document.getElementById("doblocation").innerHTML = "Please enter valid DOB";	
		status = false;

	}
	else if(gen == "" || gen == null){
		document.getElementById("genderlocation").innerHTML = "Select any Gender";
		status = false;

	}
	else if(pswd == null || pswd == ""){
		document.getElementById("passwordlocation").innerHTML = "Please enter valid password";
		status = false;

	}
	else if(!cnfpswd.match(pswd)){
		document.getElementById("confirmPasswordlocation").innerHTML = alert("Confirm Password not matched with Password");
		status = false;

	}
	else {
		document.getElementById("namelocation").innerHTML = "Valid Entries";
		status = true;
	}
	return status;
}



