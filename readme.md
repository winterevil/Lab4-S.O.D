## Question: Is the layered design (II) reasonable?

Yes, the 3-layer architecture used in this assignment is reasonable because:

**It follows SOLID principles:**
    
- **SRP (Single Responsibility):** Each class has one clear responsibility.
- **OCP (Open-Closed Principle):** New payment methods can be added without modifying existing logic.
- **DIP (Dependency Inversion):** The service depends on interfaces, not concrete classes.

**It supports Dependency Injection**: Business logic doesn't care about specific payment types.

**It is maintainable and testable**: Easy to unit test `PaymentService` with different strategies.
