-- Table to store columns for each template
CREATE TABLE template_columns (
    id SERIAL PRIMARY KEY,
    template_id INT REFERENCES templates(id) ON DELETE CASCADE,
    column_name VARCHAR(255) NOT NULL,
    data_type VARCHAR(50) NOT NULL, -- Example: 'integer', 'string', 'date', etc.
    position INT NOT NULL -- Position in the CSV file
);