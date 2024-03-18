document.addEventListener('DOMContentLoaded', function() {
      const passwordInput = document.getElementById('newpassword');
      const confirmPasswordInput = document.getElementById('cnpassword');

      function validatePassword() {
        if (passwordInput.value !== confirmPasswordInput.value) {
          confirmPasswordInput.setCustomValidity("Passwords don't match");
        } else {
          confirmPasswordInput.setCustomValidity('');
        }
      }

      passwordInput.addEventListener('change', validatePassword);
      confirmPasswordInput.addEventListener('input', validatePassword);
    });