import pandas as pd

data = {'name': ['Alice', 'Bob', 'Charlie', 'Dave', 'Eva'],
        'age': [23, 54, 32, 43, 28],
        'height': [168, 172, 170, 165, 174]}

df = pd.DataFrame(data)

count_by_name = df['name'].value_counts()
total_age = df['age'].sum()
average_height = df['height'].mean()
std_age = df['age'].std()
max_age = df['age'].max()

print("Count by name:\n", count_by_name)
print("Total age:", total_age)
print("Average height:", average_height)
print("Standard deviation of age:", std_age)
print("Maximum age:", max_age)