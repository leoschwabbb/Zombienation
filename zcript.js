// function noDisabled() {
//     email=document.querySelector("#email").value
//     pass=document.querySelector("#pass").value
//     if (email.length>0 && pass.length>0) {
//         document.querySelector("#btnSubmit").className="btn btn-primary"
//     } else {
//         document.querySelector("#btnSubmit").className="btn btn-primary disabled"
//     }
// }


function enableBtn() {
    email=document.querySelector("#email").value
    pass=document.querySelector("#pass").value
    tieneArroba=email.indexOf("@")!=-1
    if (email.length>0 && tieneArroba && pass.length>0) {
        document.querySelector("#btnSubmit").className="btn btn-primary"    
    } else {
        document.querySelector("#btnSubmit").className="btn btn-primary disabled"    
    }

    
}
window.addEventListener('scroll', function() {
    const navbar = document.querySelector('.header');
    if (window.scrollY > 0) {
      navbar.classList.add('scrolled');
    } else {
      navbar.classList.remove('scrolled');
    }
});

function isStrongPassword(password) {
  // Expresiones regulares para verificar los requisitos de la contraseña
  const hasUpperCase = /[A-Z]/.test(password);
  const hasLowerCase = /[a-z]/.test(password);
  const hasDigit = /\d/.test(password);
  const hasMinimumLength = password.length > 8;

  // Verificar si la contraseña cumple con todos los requisitos
  return hasUpperCase && hasLowerCase && hasDigit && hasMinimumLength;
}

function checkPasswordStrength() {
  const password = document.getElementById("fpass").value;
  const resultElement = document.getElementById("password-strength-result");

  if (isStrongPassword(password)) {
      resultElement.textContent = "La contraseña es fuerte.";
      resultElement.style.color = "green";
  } else {
      resultElement.textContent = "La contraseña no es fuerte.";
      resultElement.style.color = "white";
  }
}
