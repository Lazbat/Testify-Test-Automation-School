import testcases


def test_compare_two_strings():
    assert testcases.compare_two_strings("hello", "hello")


def test_compare_different_numbers():
    assert testcases.compare_different_numbers(25, 67)
