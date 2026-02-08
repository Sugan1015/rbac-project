// Hardcoded role for demo (later comes from backend)
const role = "USER";

console.log("Dashboard loaded for role:", role);

// Apply RBAC rules
if (role === "USER") {

    // Hide salary header
    const salaryHeader = document.getElementById("salaryHeader");
    if (salaryHeader) {
        salaryHeader.style.display = "none";
    }

    // Hide salary cells
    const salaryCells = document.getElementsByClassName("salary");
    for (let cell of salaryCells) {
        cell.style.display = "none";
    }

    // Disable Edit buttons
    const editButtons = document.getElementsByClassName("edit-btn");
    for (let btn of editButtons) {
        btn.disabled = true;
    }
}


