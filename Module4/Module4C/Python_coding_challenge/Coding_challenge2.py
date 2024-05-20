# Create a length converter function.

def length_converter(value, initial_unit, new_unit):
    # Dictionary to store conversion factors to meters
    to_meters = {
        'meters': 1,
        'kilometers': 1000,
        'miles': 1609.34,
        'feet': 0.3048
    }

    # Convert the input value to meters first
    if initial_unit not in to_meters or new_unit not in to_meters:
        raise ValueError("Unsupported unit")

    value_in_meters = value * to_meters[initial_unit]

    # Convert from meters to the target unit
    converted_value = value_in_meters / to_meters[new_unit]

    return converted_value


# Example: convert 20meters to kilometers
value = 20
initial_unit = 'meters'
new_unit = 'kilometers'
converted_value_in_km = length_converter(value, initial_unit, new_unit)
print(value, initial_unit, "=", converted_value_in_km, new_unit)
