class TransactionException extends Exception {
    public TransactionException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class TransactionProcessor {
    public void processTransaction() throws TransactionException {
        try {
            // Code that processes user transactions
            // ...
            throw new RuntimeException("Simulating an error during transaction processing");
        } catch (Exception e) {
            // Add custom context message
            String contextMessage = "Error occurred while processing transaction: ";
            throw new TransactionException(contextMessage + e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        TransactionProcessor processor = new TransactionProcessor();
        try {
            processor.processTransaction();
        } catch (TransactionException te) {
            System.err.println("Transaction processing failed: " + te.getMessage());
            te.printStackTrace();
        }
    }
}
